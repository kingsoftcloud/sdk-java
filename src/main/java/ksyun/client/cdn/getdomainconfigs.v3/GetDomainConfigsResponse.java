package ksyun.client.cdn.getdomainconfigs.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainConfigsResponse
* @Description GetDomainConfigs 返回体
*/
@Data
@ToString
public class GetDomainConfigsResponse extends BaseResponseModel {

    /**对应的配置数据，参考上面ConfigList的请求参数名和返回参数名的对应关系
*/
    @JsonProperty("DomainConfigs")
    private String DomainConfigs;

}
