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
     * 日志存储时长
     */
    @KsYunField(name = "StorageTime")
    private Integer StorageTime;

}