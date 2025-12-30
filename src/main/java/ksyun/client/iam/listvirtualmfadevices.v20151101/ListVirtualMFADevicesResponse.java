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
        private ListVirtualMFADevicesResultVirtualMFADevicesDto VirtualMFADevices;

        @Data
        @ToString
        public static class ListVirtualMFADevicesResultVirtualMFADevicesDto {
            /***/
            @JsonProperty("member")
            private List<ListVirtualMFADevicesResultVirtualMFADevicesMemberDto> Member;

            @Data
            @ToString
            public static class ListVirtualMFADevicesResultVirtualMFADevicesMemberDto {
                /***/
                @JsonProperty("SerialNumber")
                private String SerialNumber;

                /***/
                @JsonProperty("EnableDate")
                private String EnableDate;

                /***/
                @JsonProperty("User")
                private ListVirtualMFADevicesResultVirtualMFADevicesMemberUserDto User;

                @Data
                @ToString
                public static class ListVirtualMFADevicesResultVirtualMFADevicesMemberUserDto {
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
