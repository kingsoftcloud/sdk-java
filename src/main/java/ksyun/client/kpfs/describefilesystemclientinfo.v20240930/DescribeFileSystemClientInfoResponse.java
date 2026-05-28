package ksyun.client.kpfs.describefilesystemclientinfo.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFileSystemClientInfoResponse
* @Description DescribeFileSystemClientInfo 返回体
*/
@Data
@ToString
public class DescribeFileSystemClientInfoResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**客户端数据信息。*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**客户端所在主机名。*/
        @JsonProperty("HostName")
        private String HostName;

        /**客户端所在主机IP。

容量Ⅰ型、容量Ⅱ型、标准型返回VPC IP，性能Ⅰ型、性能Ⅱ型返回SroCE IP。*/
        @JsonProperty("Ip")
        private String Ip;

        /**客户端所在主机 VPC IP。仅性能Ⅰ型、性能Ⅱ型返回。*/
        @JsonProperty("VpcIp")
        private String VpcIp;

        /**客户端挂载点。仅容量Ⅰ型、容量Ⅱ型、标准型返回。*/
        @JsonProperty("MountPoint")
        private String MountPoint;

        /**客户端版本。仅容量Ⅰ型、容量Ⅱ型、标准型返回。*/
        @JsonProperty("Version")
        private String Version;

        /**客户端文件句柄数。仅容量Ⅰ型、容量Ⅱ型、标准型返回。*/
        @JsonProperty("FileHandles")
        private Integer FileHandles;

        /**客户端运行时间，单位：s。仅容量Ⅰ型、容量Ⅱ型、标准型返回。*/
        @JsonProperty("RunningTime")
        private Long RunningTime;

        /**客户端挂载参数。仅容量Ⅰ型、容量Ⅱ型、标准型返回。*/
        @JsonProperty("CmdArgs")
        private String CmdArgs;

        /**客户端所在缓存组。仅容量Ⅰ型、容量Ⅱ型、标准型返回，若为空，则代表未加入任何缓存组。*/
        @JsonProperty("CacheGroup")
        private String CacheGroup;

        /**客户端在缓存组中的角色。仅容量Ⅰ型、容量Ⅱ型、标准型返回，若为空，则代表未加入任何缓存组。

consumer：代表消费者，即缓存组中的--no-sharing节点

provider：代表提供者*/
        @JsonProperty("CacheGroupRole")
        private String CacheGroupRole;

        /**客户端ID。仅性能Ⅰ型、性能Ⅱ型返回。*/
        @JsonProperty("ClientId")
        private String ClientId;

    }

    /**分页大小。*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**页码。*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**文件系统的客户端总数量。*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
