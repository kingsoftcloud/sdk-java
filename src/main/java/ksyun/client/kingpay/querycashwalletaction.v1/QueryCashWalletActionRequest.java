package ksyun.client.kingpay.querycashwalletaction.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryCashWalletActionRequest
* @Description 请求参数
*/
@Data
public class QueryCashWalletActionRequest{
    /**1:金山云，2：边缘云*/
    @KsYunField(name="subject")
    private Integer Subject;

}
