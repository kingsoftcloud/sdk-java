package ksyun.client.eip.allocateaddress.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AllocateAddressResponse
* @Description AllocateAddress 返回体
*/
@Data
@ToString
public class AllocateAddressResponse extends BaseResponseModel {
    /**弹性IP的ID*/
    @JsonProperty("AllocationId")
    private String AllocationId;

    /**弹性IP地址*/
    @JsonProperty("PublicIp")
    private String PublicIp;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**IP版本*/
    @JsonProperty("IpVersion")
    private String IpVersion;

}
