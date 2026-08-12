package ksyun.client.kpfs.describefilesystemfilelist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFileSystemFileListResponse
* @Description DescribeFileSystemFileList 返回体
*/
@Data
@ToString
public class DescribeFileSystemFileListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**目录或文件数据。*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**文件名字。*/
        @JsonProperty("Name")
        private String Name;

        /**类型。有效值：file（文件）、dir（目录）。*/
        @JsonProperty("Type")
        private String Type;

        /**文件大小。单位：B。*/
        @JsonProperty("Length")
        private Long Length;

        /**文件最后修改时间。格式：2024-11-25 10:39:07。*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

    /**分页大小。*/
    @JsonProperty("PageSize")
    private Long PageSize;

    /**页码。*/
    @JsonProperty("PageNum")
    private Long PageNum;

    /**文件系统的文件总数。*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

}
