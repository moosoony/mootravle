package kr.co.mootravle.User;

import kr.co.mootravle.Travel.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);

    // 사용자가 작성한 Travel 찾기
    @Query("select t from Travel t where t.author.id =:id")
    List<Travel> findByAuthorId(Long id);

}
