package uz.almos.appdatarestsecond.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.almos.appdatarestsecond.entity.Address;
// 4-ish
// types = Address.class bu: qaysi classga xizmat qiladi..
@Projection(types = Address.class)
public interface CustomerAddress {
    Integer getId();
    String getCity();
    String getDistrict();
//    String getStreet(); // buni bermasak chiqmaydi
}
