package ksyun.client.knad.getknadpolicy.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetKnadPolicyResponse
* @Description GetKnadPolicy 返回体
*/
@Data
@ToString
public class GetKnadPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TemplateId")
    private Integer TemplateId;

    /**Udp封禁。
1：封禁 0：不封禁*/
    @JsonProperty("UdpBlock")
    private Integer UdpBlock;

    /***/
    @JsonProperty("TcpBlock")
    private Integer TcpBlock;

    /***/
    @JsonProperty("IcmpBlock")
    private Integer IcmpBlock;

}
