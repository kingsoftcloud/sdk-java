package ksyun.client.kpfs.describeperformanceoneposixacllist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePerformanceOnePosixAclListResponse
* @Description DescribePerformanceOnePosixAclList 返回体
*/
@Data
@ToString
public class DescribePerformanceOnePosixAclListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("PosixAclId")
        private String PosixAclId;

        /***/
        @JsonProperty("FileSystemList")
        private List<DataDtoFileSystemListDto> FileSystemList;

        @Data
        @ToString
        public static class DataDtoFileSystemListDto {
            /***/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /***/
            @JsonProperty("VolumePath")
            private String VolumePath;

            /***/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

        }

        /***/
        @JsonProperty("Ips")
        private List<String> Ips;

        /***/
        @JsonProperty("Desc")
        private String Desc;

        /***/
        @JsonProperty("AutoMount")
        private Boolean AutoMount;

    }

    /***/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /***/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
