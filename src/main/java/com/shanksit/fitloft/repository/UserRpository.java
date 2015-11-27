package com.shanksit.fitloft.repository;



import com.shanksit.fitloft.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


/**
 * Created by chenleiyu on 15/11/24.
 */
@Repository
public interface UserRpository extends MongoRepository<User,String>
{

}