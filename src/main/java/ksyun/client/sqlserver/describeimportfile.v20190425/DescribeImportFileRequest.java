package ksyun.client.sqlserver.describeimportfile.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeImportFileRequest
 * @Description 请求参数
 */
@Data
public class DescribeImportFileRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 导入任务ID
     */
    @KsYunField(name = "ImportTaskId")
    private String ImportTaskId;

}