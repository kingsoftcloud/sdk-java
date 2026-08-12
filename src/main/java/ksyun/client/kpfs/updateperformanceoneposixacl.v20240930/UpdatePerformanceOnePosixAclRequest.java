package ksyun.client.kpfs.updateperformanceoneposixacl.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdatePerformanceOnePosixAclRequest
* @Description 请求参数
*/
@Data
public class UpdatePerformanceOnePosixAclRequest{
    /**POSIX访问授权规则ID*/
    @KsYunField(name="PosixAclId")
    private String PosixAclId;

    /**文件系统数组，支持批量绑定文件系统*/
    @KsYunField(name="FileSystemList",type=2)
    private List<FileSystemListDto> FileSystemListList;

    @Data
    @ToString
    public static class FileSystemListDto {
        /**KPFS文件系统实例ID*/
        @KsYunField(name="FileSystemId")
        private String FileSystemId;

        /**客户端挂载路径，默认/mnt/文件系统名/*/
        @KsYunField(name="VolumePath")
        private String VolumePath;

    }

    /**是否自动挂载；true自动挂载，false手动挂载*/
    @KsYunField(name="AutoMount")
    private Boolean AutoMount;

    /**允许访问的客户端IP列表，授权白名单*/
    @KsYunField(name="Ips",type=2)
    private List<String> IpsList;

    /**该POSIX授权规则自定义描述*/
    @KsYunField(name="Desc")
    private String Desc;

}
