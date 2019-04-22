package com.jd.journalkeeper.rpc.codec;

/**
 * @author liyue25
 * Date: 2019-03-29
 */
public class RpcTypes {
    // Client server RPCs
    public final static int UPDATE_CLUSTER_STATE_REQUEST = 1;
    public final static int UPDATE_CLUSTER_STATE_RESPONSE = -1;
    public final static int QUERY_CLUSTER_STATE_REQUEST = 2;
    public final static int QUERY_CLUSTER_STATE_RESPONSE = -2;
    public final static int QUERY_SERVER_STATE_REQUEST = 3;
    public final static int QUERY_SERVER_STATE_RESPONSE = -3;
    public final static int LAST_APPLIED_REQUEST = 4;
    public final static int LAST_APPLIED_RESPONSE = -4;
    public final static int QUERY_SNAPSHOT_REQUEST = 5;
    public final static int QUERY_SNAPSHOT_RESPONSE = -5;
    public final static int GET_SERVERS_REQUEST = 6;
    public final static int GET_SERVERS_RESPONSE = -6;
    public final static int UPDATE_VOTERS_REQUEST = 7;
    public final static int UPDATE_VOTERS_RESPONSE = -7;
    public final static int UPDATE_OBSERVERS_REQUEST = 8;
    public final static int UPDATE_OBSERVERS_RESPONSE = -8;
    public final static int ADD_PULL_WATCH_REQUEST = 9;
    public final static int ADD_PULL_WATCH_RESPONSE = -9;
    public final static int REMOVE_PULL_WATCH_REQUEST = 10;
    public final static int REMOVE_PULL_WATCH_RESPONSE = -10;
    public final static int PULL_EVENTS_REQUEST = 11;
    public final static int PULL_EVENTS_RESPONSE = -11;



    // Server RPCs
    public final static int ASYNC_APPEND_ENTRIES_REQUEST = 101;
    public final static int ASYNC_APPEND_ENTRIES_RESPONSE = -101;
    public final static int REQUEST_VOTE_REQUEST = 102;
    public final static int REQUEST_VOTE_RESPONSE = -102;
    public final static int GET_SERVER_ENTRIES_REQUEST = 103;
    public final static int GET_SERVER_ENTRIES_RESPONSE = -103;
    public final static int GET_SERVER_STATE_REQUEST = 104;
    public final static int GET_SERVER_STATE_RESPONSE = -104;

}
