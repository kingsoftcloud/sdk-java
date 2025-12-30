package ksyun.client.vpc.createvpc.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateVpcResponse
* @Description CreateVpc 返回体
*/
@Data
@ToString
public class CreateVpcResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Vpc信息*/
    @JsonProperty("Vpc")
    private VpcDto Vpc;

    @Data
    @ToString
    public static class VpcDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**Vpc的名称*/
        @JsonProperty("VpcName")
        private String VpcName;

        /**Vpc的网络范围*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**是否是默认Vpc*/
        @JsonProperty("IsDefault")
        private Boolean IsDefault;

        /**是否支持IPv6网段*/
        @JsonProperty("ProvidedIpv6CidrBlock")
        private Boolean ProvidedIpv6CidrBlock;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**Vpc Ipv6的网络范围列表*/
        @JsonProperty("Ipv6CidrBlockAssociationSet")
        private List<VpcIpv6CidrBlockAssociationSetDto> Ipv6CidrBlockAssociationSet;

        @Data
        @ToString
        public static class VpcIpv6CidrBlockAssociationSetDto {
            /**Vpc Ipv6的网络范围*/
            @JsonProperty("Ipv6CidrBlock")
            private String Ipv6CidrBlock;

        }

        /**附加网段列表*/
        @JsonProperty("SecondaryCidrSet")
        private List<VpcSecondaryCidrSetDto> SecondaryCidrSet;

        @Data
        @ToString
        public static class VpcSecondaryCidrSetDto {
            /**附加网段ID*/
            @JsonProperty("SecondaryCidrId")
            private String SecondaryCidrId;

            /**附加网段范围*/
            @JsonProperty("Cidr")
            private String Cidr;

            /**附加网段类型*/
            @JsonProperty("Type")
            private String Type;

        }

    }

}
