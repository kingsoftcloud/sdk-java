package ksyun.client.krds.gettablerestorabletime.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetTableRestorableTimeRequest
* @Description 请求参数
*/
@Data
public class GetTableRestorableTimeRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;


}