package ksyun.client.aicp.listsessionmessages.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSessionMessagesResponse
* @Description ListSessionMessages 返回体
*/
@Data
@ToString
public class ListSessionMessagesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Action")
    private String Action;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SessionId")
        private String SessionId;

        /***/
        @JsonProperty("Messages")
        private List<String> Messages;

        /***/
        @JsonProperty("LatestSeqId")
        private Integer LatestSeqId;

        /***/
        @JsonProperty("HasMore")
        private Boolean HasMore;

        /***/
        @JsonProperty("NextCursor")
        private Integer NextCursor;

        /***/
        @JsonProperty("SnapshotSeqId")
        private Integer SnapshotSeqId;

        /***/
        @JsonProperty("HistoryEpoch")
        private String HistoryEpoch;

        /***/
        @JsonProperty("PersistenceDegraded")
        private Boolean PersistenceDegraded;

    }

}
