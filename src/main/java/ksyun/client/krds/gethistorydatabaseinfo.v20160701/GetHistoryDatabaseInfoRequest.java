package ksyun.client.krds.gethistorydatabaseinfo.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetHistoryDatabaseInfoRequest
 * @Description 请求参数
 */
@Data
public class GetHistoryDatabaseInfoRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 备份ID		根据备份集查询必传
     */
    @KsYunField(name = "DBBackupIdentifier")
    private String DBBackupIdentifier;

    /**
     * 恢复时间	例如：2021-09-22 00:00:00        根据时间查询必传
     */
    @KsYunField(name = "RestorableTime")
    private String RestorableTime;

}