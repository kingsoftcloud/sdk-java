package ksyun.client.waf.modifystoragetime.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyStorageTimeRequest
 * @Description 请求参数
 */
@Data
public class ModifyStorageTimeRequest {
    /**
     * 日志存储时长，取值范围：1天≤高级版≤180天，1天≤企业版≤360天
     */
    @KsYunField(name = "StorageTime")
    private Integer StorageTime;

}