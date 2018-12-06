package life.qbic.api.v1.openbis.adapter

interface PluginAdapter {

    String getDescription()

    Set<EntityKindAdapter> getEntityKinds()

    PluginFetchOptionsAdapter getFetchOptions()

    String getName()

    PluginPermIdAdapter getPermId()

    PluginKindAdapter getPluginKind()

    PluginTypeAdapter getPluginType()

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    String getScript()

    boolean isAvailable()
}