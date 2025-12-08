package ksyun.client.iam.listvirtualmfadevices.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListVirtualMFADevicesResponse
* @Description ListVirtualMFADevices 返回体
*/
@Data
@ToString
public class ListVirtualMFADevicesResponse extends BaseResponseModel {
    /**ListVirtualMFADevicesResult*/
    @JsonProperty("ListVirtualMFADevicesResult")
    private ListVirtualMFADevicesResultDto ListVirtualMFADevicesResult;

    @Data
    @ToString
    public static class ListVirtualMFADevicesResultDto {
        /***/
        @JsonProperty("VirtualMFADevices")
        private ListVirtualMFADevicesResultDtoVirtualMFADevicesDto VirtualMFADevices;

        @Data
        @ToString
        public static class ListVirtualMFADevicesResultDtoVirtualMFADevicesDto {
            /***/
            @JsonProperty("member")
            private List<ListVirtualMFADevicesResultDtoVirtualMFADevicesDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListVirtualMFADevicesResultDtoVirtualMFADevicesDtoMemberDto {
                /***/
                @JsonProperty("SerialNumber")
                private String SerialNumber;

                /***/
                @JsonProperty("EnableDate")
                private String EnableDate;

                /***/
                @JsonProperty("User")
                private ListVirtualMFADevicesResultDtoVirtualMFADevicesDtoMemberDtoUserDto User;

                @Data
                @ToString
                public static class ListVirtualMFADevicesResultDtoVirtualMFADevicesDtoMemberDtoUserDto {
                    /***/
                    @JsonProperty("Uuid")
                    private String Uuid;

                    /***/
                    @JsonProperty("Name")
                    private String Name;

                    /***/
                    @JsonProperty("RealName")
                    private String RealName;

                    /***/
                    @JsonProperty("Path")
                    private String Path;

                    /***/
                    @JsonProperty("Krn")
                    private String Krn;

                    /***/
                    @JsonProperty("CreatedTime")
                    private String CreatedTime;

                    /***/
                    @JsonProperty("PwdLastUsed")
                    private String PwdLastUsed;

                }

            }

        }

        /***/
        @JsonProperty("Marker")
        private String Marker;

        /***/
        @JsonProperty("IsTruncated")
        private Boolean IsTruncated;

    }

}
