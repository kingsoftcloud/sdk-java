package ksyun.client.cdn.validateip.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ValidateIPResponse
* @Description ValidateIP 返回体
*/
@Data
@ToString
public class ValidateIPResponse extends BaseResponseModel {

    /**是否为金山云的CDNIP，如果是，则为true；如果不是，则为false*/
    @JsonProperty("CdnIp")
    private String CdnIp;

    /**运营商，运营商枚举见[使用须知](https://docs.ksyun.com/documents/196#38)*/
    @JsonProperty("Isp")
    private String Isp;

    /**区域，区域枚举见[使用须知](https://docs.ksyun.com/documents/196#36)*/
    @JsonProperty("Region")
    private String Region;

    /**省份，省份枚举见[使用须知](https://docs.ksyun.com/documents/196#37)*/
    @JsonProperty("Province")
    private String Province;

    /**城市*/
    @JsonProperty("City")
    private String City;

}
