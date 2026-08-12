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

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**POSIX授权列表数组*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**授权规则ID*/
        @JsonProperty("PosixAclId")
        private String PosixAclId;

        /**绑定文件系统数组*/
        @JsonProperty("FileSystemList")
        private List<DataFileSystemListDto> FileSystemList;

        @Data
        @ToString
        public static class DataFileSystemListDto {
            /**文件系统ID*/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /**文件系统名称*/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**挂载路径*/
            @JsonProperty("VolumePath")
            private String VolumePath;

        }

        /**授权IP列表*/
        @JsonProperty("Ips")
        private List<String> Ips;

        /**规则描述*/
        @JsonProperty("Desc")
        private String Desc;

        /**是否自动挂载*/
        @JsonProperty("AutoMount")
        private Boolean AutoMount;

    }

    /**当前页码*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**每页条数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总记录数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
