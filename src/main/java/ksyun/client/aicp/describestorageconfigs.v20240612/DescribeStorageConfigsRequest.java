package ksyun.client.aicp.describestorageconfigs.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeStorageConfigsRequest
 * @Description 请求参数
 */
@Data
public class DescribeStorageConfigsRequest {
    /**
     * 多个存储配置的ID
     */
    @KsYunField(name = "StorageConfigId", type = 1)
    private List<String> StorageConfigIdList;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - storage-type，存储类型（可选KPFS、KS3）
         * - storage-name，存储配置名称
         * - mnt-protocol，KPFS类型存储配置的mnt协议（可选POSIX、NFS）
         * - storage-id，KPFS类型文件系统ID或KS3类型存储桶名bucket
         */
        @KsYunField(name = "Name")
        private String Name;

        /***/
        @KsYunField(name = "Value", type = 1)
        private List<String> ValueList;

    }

    /**
     * 单次调用可返回的最大条目数量
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * 页码
     */
    @KsYunField(name = "Page")
    private Integer Page;

}
