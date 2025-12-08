package ksyun.client.vpc.modifydirectconnect.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDirectConnectResponse
* @Description ModifyDirectConnect 返回体
*/
@Data
@ToString
public class ModifyDirectConnectResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**物理专线的信息*/
    @JsonProperty("DirectConnect")
    private DirectConnectDto DirectConnect;

    @Data
    @ToString
    public static class DirectConnectDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**物理端口ID*/
        @JsonProperty("DirectConnectId")
        private String DirectConnectId;

        /**物理专线的名称*/
        @JsonProperty("DirectConnectName")
        private String DirectConnectName;

        /**专线类型，同城裸纤(fiber)、跨城电路(curcuit)、KIS裸纤(kisfiber)、DX(dx)*/
        @JsonProperty("Type")
        private String Type;

        /**接入金山云地点，上地(BJJS01)、清河(BJZC01)、中经(BJZJY01)、大红门(BJDHM01)、武清(TJWQ01)*/
        @JsonProperty("PopLocation")
        private String PopLocation;

        /**接入客户IDC地点*/
        @JsonProperty("CustomerLocation")
        private String CustomerLocation;

        /**专线的状态*/
        @JsonProperty("State")
        private String State;

        /**物理专线的限速带宽*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**是否支持Vlan*/
        @JsonProperty("Vlan")
        private Boolean Vlan;

        /**物理专线的长度*/
        @JsonProperty("Distance")
        private Integer Distance;

        /**Noc的ID*/
        @JsonProperty("VpcNOCId")
        private String VpcNOCId;

    }

}
