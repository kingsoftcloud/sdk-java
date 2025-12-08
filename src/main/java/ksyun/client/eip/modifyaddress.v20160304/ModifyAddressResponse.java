package ksyun.client.eip.modifyaddress.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyAddressResponse
* @Description ModifyAddress 返回体
*/
@Data
@ToString
public class ModifyAddressResponse extends BaseResponseModel {
    /**线路ID*/
    @JsonProperty("LineId")
    private String LineId;

    /**弹性IP的带宽*/
    @JsonProperty("BandWidth")
    private Integer BandWidth;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**弹性IP的状态，已绑定(associate)，未绑定(disassociate)*/
    @JsonProperty("State")
    private String State;

    /**弹性IP的ID*/
    @JsonProperty("AllocationId")
    private String AllocationId;

    /**IP地址*/
    @JsonProperty("PublicIp")
    private String PublicIp;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**绑定类型*/
    @JsonProperty("InstanceType")
    private String InstanceType;

    /**绑定实例ID*/
    @JsonProperty("InstanceId")
    private String InstanceId;

    /**IP版本*/
    @JsonProperty("IpVersion")
    private String IpVersion;

    /**网卡ID*/
    @JsonProperty("NetworkInterfaceId")
    private String NetworkInterfaceId;

}
