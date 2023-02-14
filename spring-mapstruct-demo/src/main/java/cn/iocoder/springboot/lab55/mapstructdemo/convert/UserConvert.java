package cn.iocoder.springboot.lab55.mapstructdemo.convert;

import cn.iocoder.springboot.lab55.mapstructdemo.bo.UserBO;
import cn.iocoder.springboot.lab55.mapstructdemo.bo.UserDetailBO;
import cn.iocoder.springboot.lab55.mapstructdemo.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserBO convert(UserDO userDO);

    /**
     * 在对象转换时，我们可能会存在属性不是完全映射的情况，例如说属性名不同
     * @param userDO
     * @return
     */
    @Mappings({@Mapping(source = "id", target = "userId")
    })
    UserDetailBO convertDetail(UserDO userDO);

}
