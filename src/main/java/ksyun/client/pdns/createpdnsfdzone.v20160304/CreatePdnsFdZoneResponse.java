package ksyun.client.pdns.createpdnsfdzone.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreatePdnsFdZoneResponse
* @Description CreatePdnsFdZone 返回体
*/
@Data
@ToString
public class CreatePdnsFdZoneResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**转发Zone信息*/
    @JsonProperty("FdZone")
    private FdZoneDto FdZone;

    @Data
    @ToString
    public static class FdZoneDto {
        /**ID*/
        @JsonProperty("id")
        private String Id;

        /**转发Zone名称*/
        @JsonProperty("ZoneName")
        private String ZoneName;

        /**其关联的出站节点Id*/
        @JsonProperty("EndPointId")
        private String EndPointId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**所绑定的VPC的信息*/
        @JsonProperty("BindVpcSet")
        private List<FdZoneDtoBindVpcSetDto> BindVpcSet;

        @Data
        @ToString
        public static class FdZoneDtoBindVpcSetDto {
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

}
