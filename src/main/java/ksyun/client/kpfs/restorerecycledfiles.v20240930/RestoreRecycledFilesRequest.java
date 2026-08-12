package ksyun.client.kpfs.restorerecycledfiles.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RestoreRecycledFilesRequest
* @Description 请求参数
*/
@Data
public class RestoreRecycledFilesRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**回收站的相对地址，仅性能型支持*/
    @KsYunField(name="RecycledPath")
    private String RecycledPath;

    /**文件信息*/
    @KsYunField(name="Files",type=2)
    private List<FilesDto> FilesList;

    @Data
    @ToString
    public static class FilesDto {
        /**文件名称，仅性能型支持*/
        @KsYunField(name="FileName")
        private String FileName;

        /**文件删除时间（进入回收站时间），仅性能型支持*/
        @KsYunField(name="DeleteTime")
        private Long DeleteTime;

        /**文件被删除前的完整源路径，该参数与Inodes参数二选一*/
        @KsYunField(name="Position")
        private String Position;

        /**类型*/
        @KsYunField(name="Type")
        private String Type;

        /**长度*/
        @KsYunField(name="Length")
        private Long Length;

    }

    /**文件Inode值数据，该参数与Position参数二选一，仅容量型/标准型支持
*/
    @KsYunField(name="Inodes",type=2)
    private List<Integer> InodesList;

}
