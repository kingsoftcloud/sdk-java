package ksyun.client.epc.describesouserdata.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoUserDataResponse
* @Description DescribeSoUserData 返回体
*/
@Data
@ToString
public class DescribeSoUserDataResponse extends BaseResponseModel {
    /**实例ID*/
    @JsonProperty("InstanceId")
    private String InstanceId;

    /**实例的自定义数据*/
    @JsonProperty("UserData")
    private String UserData;

}
