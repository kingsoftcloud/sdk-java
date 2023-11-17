package ksyun.client.pdns.modifyrecord.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyRecordRequest
* @Description 请求参数
*/
@Data
public class ModifyRecordRequest{
    /**记录值*/
    @KsYunField(name="RecordValue")
    private String RecordValue;


}