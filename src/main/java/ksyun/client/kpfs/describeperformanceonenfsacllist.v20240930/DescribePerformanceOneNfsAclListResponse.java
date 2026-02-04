package ksyun.client.kpfs.describeperformanceonenfsacllist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePerformanceOneNfsAclListResponse
* @Description DescribePerformanceOneNfsAclList 返回体
*/
@Data
@ToString
public class DescribePerformanceOneNfsAclListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**访问授权列表信息*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**规则ID。*/
        @JsonProperty("NfsAclId")
        private String NfsAclId;

        /**共享目录路径。*/
        @JsonProperty("ExportPath")
        private String ExportPath;

        /**文件系统信息*/
        @JsonProperty("FileSystemList")
        private List<DataFileSystemListDto> FileSystemList;

        @Data
        @ToString
        public static class DataFileSystemListDto {
            /**文件系统的实例ID。*/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /**文件系统所在地域。*/
            @JsonProperty("Region")
            private String Region;

            /**文件系统名称。*/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**挂载域名。*/
            @JsonProperty("MountDomain")
            private String MountDomain;

        }

        /**授权IP列表。（当请求体带NfsAclId时，才会返回Ips信息）*/
        @JsonProperty("Ips")
        private List<DataIpsDto> Ips;

        @Data
        @ToString
        public static class DataIpsDto {
            /**授权IP地址，支持IPv4。单个IP示例：10.0.0.0；网段示例：10.0.0.1/24*/
            @JsonProperty("Ip")
            private String Ip;

            /**指定的权限级别。枚举值：ro（只读）、rw（读/写）*/
            @JsonProperty("Permission")
            private String Permission;

            /**root权限压缩。枚举值：root_squash（客户端以root用户访问，映射为匿名用户）、no_root_squash（允许客户端以root用户访问）、all_squash（所有客户端访问，均映射为匿名用户）*/
            @JsonProperty("RootSquash")
            private String RootSquash;

            /**计算节点主机名。*/
            @JsonProperty("Hostname")
            private String Hostname;

            /**计算节点类型。枚举值：epc（裸金属服务器）、kec（云服务器）*/
            @JsonProperty("Type")
            private String Type;

        }

        /**规则描述信息。*/
        @JsonProperty("Desc")
        private String Desc;

    }

}
