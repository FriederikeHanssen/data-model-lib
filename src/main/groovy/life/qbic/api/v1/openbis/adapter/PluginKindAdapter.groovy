package life.qbic.api.v1.openbis.adapter

interface PluginKindAdapter {

    PluginAdapter valueOf(Object name)

    PluginAdapter[] values()
}
