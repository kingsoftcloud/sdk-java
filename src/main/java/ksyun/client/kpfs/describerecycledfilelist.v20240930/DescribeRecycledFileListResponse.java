package ksyun.client.kpfs.describerecycledfilelist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRecycledFileListResponse
* @Description DescribeRecycledFileList 返回体
*/
@Data
@ToString
public class DescribeRecycledFileListResponse extends BaseResponseModel {

    /**文件列表*/
    @JsonProperty("Files")
    private List<FilesDto> Files;

    @Data
    @ToString
    public static class FilesDto {
        /**文件名称*/
        @JsonProperty("FileName")
        private String FileName;

        /**文件所在的源路径*/
        @JsonProperty("RecycledPath")
        private String RecycledPath;

        /**文件删除时间（进入回收站的时间）*/
        @JsonProperty("DeleteTime")
        private Long DeleteTime;

        /**文件被删除前的完整源路径*/
        @JsonProperty("Position")
        private String Position;

        /**文件类型，为file（文件）*/
        @JsonProperty("Type")
        private String Type;

        /**文件大小，单位Byte*/
        @JsonProperty("Length")
        private Long Length;

        /**文件Inode值，仅容量型/标准型支持*/
        @JsonProperty("Inode")
        private Integer Inode;

    }

    /**回收站内文件总大小，仅容量型/标准型支持*/
    @JsonProperty("TotalBytes")
    private Integer TotalBytes;

    /**回收站内文件总数量，仅容量型/标准型支持*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
