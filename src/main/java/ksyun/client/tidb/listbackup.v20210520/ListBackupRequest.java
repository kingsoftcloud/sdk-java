package ksyun.client.tidb.listbackup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListBackupRequest
 * @Description 请求参数
 */
@Data
public class ListBackupRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 备份名称模糊查询。
     */
    @KsYunField(name = "Keyword")
    private String Keyword;

}