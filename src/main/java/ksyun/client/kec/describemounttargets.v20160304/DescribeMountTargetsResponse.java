package ksyun.client.kec.describemounttargets.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMountTargetsResponse
* @Description DescribeMountTargets 返回体
*/
@Data
@ToString
public class DescribeMountTargetsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("DescribeMountTargetsResponse")
    private DescribeMountTargetsResponseDto DescribeMountTargetsResponse;

    @Data
    @ToString
    public static class DescribeMountTargetsResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Marker")
        private String Marker;

        /***/
        @JsonProperty("FileSystemCount")
        private String FileSystemCount;

        /***/
        @JsonProperty("MountTargets")
        private MountTargetsDto MountTargets;

        @Data
        @ToString
        public static class MountTargetsDto {
            /***/
            @JsonProperty("Item")
            private ItemDto Item;

            @Data
            @ToString
            public static class ItemDto {
                /***/
                @JsonProperty("MountTargetId")
                private String MountTargetId;

                /***/
                @JsonProperty("SubnetId")
                private String SubnetId;

                /***/
                @JsonProperty("IpAddress")
                private String IpAddress;

                /***/
                @JsonProperty("MountTargetState")
                private String MountTargetState;

                /***/
                @JsonProperty("CreationDate")
                private String CreationDate;

            }

        }

    }

}
