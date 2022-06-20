package uz.almos.appdatarestsecond.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.almos.appdatarestsecond.entity.Address;
import uz.almos.appdatarestsecond.projection.CustomerAddress;

// 3-ish

/**
 *collectionResourceRel = "list" : Javobda addresses boladi shuni ozgartirmoqchi bolsak biron nima yozish kk masalan list
 */
@RepositoryRestResource(path = "address", collectionResourceRel = "list",excerptProjection = CustomerAddress.class)
public interface AddressRepository extends JpaRepository<Address,Integer> {

    // Qidirish uchun
    @RestResource(path = "byName")
    public Page<Address> findAllByCity(@Param("city") String city, Pageable pageable);
    // qidirish: http://localhost:8080/api/address/search/byName?city=Qarshi

    //Sort uchun
//    http://localhost:8080/api/address?sort=street
//    http://localhost:8080/api/address?sort=street,desc
//    http://localhost:8080/api/address?sort=street,city,desc
}
