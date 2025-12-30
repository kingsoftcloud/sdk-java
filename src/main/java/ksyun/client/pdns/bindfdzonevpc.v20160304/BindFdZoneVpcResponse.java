package ksyun.client.pdns.bindfdzonevpc.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BindFdZoneVpcResponse
* @Description BindFdZoneVpc 返回体
*/
@Data
@ToString
public class BindFdZoneVpcResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**请求发送是否成功，具体绑定状态取决于BindVpcSet中的Status*/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /**所绑定的VPC信息*/
    @JsonProperty("BindVpcSet")
    private List<BindVpcSetDto> BindVpcSet;

    @Data
    @ToString
    public static class BindVpcSetDto {
        /**绑定ID*/
        @JsonProperty("BindVpcId")
        private String BindVpcId;

        /**机房名称*/
        @JsonProperty("RegionName")
        private String RegionName;

        /**VpcId*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**转发Zone的ID*/
        @JsonProperty("FdZoneId")
        private String FdZoneId;

        /**出站节点的状态,building | active | error | updating | deleting | updatingError*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间*/
        @JsonProperty("Created")
        private String Created;

    }

}
