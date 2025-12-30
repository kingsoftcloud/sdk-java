package ksyun.client.epc.describesoimages.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoImagesResponse
* @Description DescribeSoImages 返回体
*/
@Data
@ToString
public class DescribeSoImagesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Images")
    private List<ImagesDto> Images;

    @Data
    @ToString
    public static class ImagesDto {
        /**amd64*/
        @JsonProperty("Architecture")
        private String Architecture;

        /**UEFI*/
        @JsonProperty("BootMode")
        private String BootMode;

        /**2025-06-13T16:02:32+08:00*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**nccl-ok_cloudinit-ok_reset-authentication-ok*/
        @JsonProperty("Description")
        private String Description;

        /**19c0cfee-dda3-4e80-a29d-6f51a47cb107*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**ksyun_ubuntu_22.04_nccl01*/
        @JsonProperty("ImageName")
        private String ImageName;

        /**false*/
        @JsonProperty("IsSupportCloudInit")
        private Boolean IsSupportCloudInit;

        /**5.15.0-43-generic*/
        @JsonProperty("Kernel")
        private String Kernel;

        /**Ubuntu 22.04 64 bit*/
        @JsonProperty("OsName")
        private String OsName;

        /**Linux*/
        @JsonProperty("OsType")
        private String OsType;

        /**available*/
        @JsonProperty("Status")
        private String Status;

        /**Ubuntu*/
        @JsonProperty("Platform")
        private String Platform;

        /**500*/
        @JsonProperty("Size")
        private Integer Size;

        /**2025-06-13T16:08:24+08:00*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

        /**536870912000*/
        @JsonProperty("VirtualSize")
        private Integer VirtualSize;

        /**public*/
        @JsonProperty("Visibility")
        private String Visibility;

    }

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
