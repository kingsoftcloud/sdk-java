package ksyun.client.krds.deletedbbackup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDBBackupRequest
* @Description 请求参数
*/
@Data
public class DeleteDBBackupRequest{
    /**备份ID*/
    @KsYunField(name="DBBackupIdentifier")
    private String DBBackupIdentifier;


}