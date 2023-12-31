package org.example.Respositories;
import org.example.Entities.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JwtUserRepository extends JpaRepository<JwtUser, Long> {
    // Add custom query methods if needed
    @Query(nativeQuery = true,
            value = "SELECT * FROM jwt_user WHERE email = :email"
    )
    JwtUser findUserByEmail(@Param("email") String email);

//    @Query(nativeQuery = true,
//            value = "SELECT * FROM jwt_user WHERE username = :username"
//    )
//    JwtUser findUserByUserName(@Param("username") String username);

}