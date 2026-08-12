package ksyun.client.kpfs.describeclientinstallinfo.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClientInstallInfoResponse
* @Description DescribeClientInstallInfo 返回体
*/
@Data
@ToString
public class DescribeClientInstallInfoResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ClusterDataIP")
    private String ClusterDataIP;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DownloadUrl")
        private String DownloadUrl;

        /***/
        @JsonProperty("OsVersion")
        private String OsVersion;

        /***/
        @JsonProperty("KernelVersion")
        private String KernelVersion;

        /***/
        @JsonProperty("NicDriver")
        private String NicDriver;

    }

}
