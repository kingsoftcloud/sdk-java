package ksyun.client.krds.restoretocurinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname RestoreToCurInstanceRequest
 * @Description 请求参数
 */
@Data
public class RestoreToCurInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 备份ID	根据备份恢复，必传备份ID，且必传SrcDatabases和DstDatabases
     */
    @KsYunField(name = "DBBackupIdentifier")
    private String DBBackupIdentifier;

    /**
     * 恢复时间		根据时间点恢复，必传时间点，且必传SrcDatabases和DstDatabases；格式：yyyy-MM-dd HH:mm:ss
     */
    @KsYunField(name = "RestorableTime")
    private String RestorableTime;

    /**
     * 源		[{<br>  "DatabaseName": "wang",<br>"WholeDatabase":"True",<br>"TableNames": [<br>"li"]<br>}]
     */
    @KsYunField(name = "SrcDatabases", type = 2)
    private List<SrcDatabasesDto> SrcDatabasesList;
    /**
     * 目标		[{<br>"DatabaseName": "wang",<br>"WholeDatabase":"True",<br>"TableNames": [<br> "li"]<br> }]
     */
    @KsYunField(name = "DstDatabases", type = 2)
    private List<DstDatabasesDto> DstDatabasesList;

    @Data
    @ToString
    public static class SrcDatabasesDto {
    }

    @Data
    @ToString
    public static class DstDatabasesDto {
    }


}