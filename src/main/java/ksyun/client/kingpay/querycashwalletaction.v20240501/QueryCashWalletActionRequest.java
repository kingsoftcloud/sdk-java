package ksyun.client.kingpay.querycashwalletaction.v20240501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryCashWalletActionRequest
 * @Description 请求参数
 */
@Data
public class QueryCashWalletActionRequest {
    /**
     * 1:金山云，2：边缘云
     */
    @KsYunField(name = "subject")
    private Integer Subject;


}