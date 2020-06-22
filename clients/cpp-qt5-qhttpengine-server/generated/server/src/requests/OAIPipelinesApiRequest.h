/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIPipelinesApiRequest_H
#define OAI_OAIPipelinesApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIPipeline.h"
#include "OAIPipelineList.h"
#include <QString>
#include "OAIPipelinesApiHandler.h"

namespace OpenAPI {

class OAIPipelinesApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIPipelinesApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIPipelinesApiHandler> handler);
    virtual ~OAIPipelinesApiRequest();

    void deletePipelineRequest(const QString& program_id, const QString& pipeline_id);
    void getPipelineRequest(const QString& program_id, const QString& pipeline_id);
    void getPipelinesRequest(const QString& program_id);
    void patchPipelineRequest(const QString& program_id, const QString& pipeline_id);
    

    void deletePipelineResponse();
    void getPipelineResponse(const OAIPipeline& res);
    void getPipelinesResponse(const OAIPipelineList& res);
    void patchPipelineResponse(const OAIPipeline& res);
    

    void deletePipelineError(QNetworkReply::NetworkError error_type, QString& error_str);
    void getPipelineError(const OAIPipeline& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getPipelinesError(const OAIPipelineList& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void patchPipelineError(const OAIPipeline& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void deletePipeline(QString program_id, QString pipeline_id, QString x_gw_ims_org_id, QString authorization, QString x_api_key);
    void getPipeline(QString program_id, QString pipeline_id, QString x_gw_ims_org_id, QString authorization, QString x_api_key);
    void getPipelines(QString program_id, QString x_gw_ims_org_id, QString authorization, QString x_api_key);
    void patchPipeline(QString program_id, QString pipeline_id, QString x_gw_ims_org_id, QString authorization, QString x_api_key, QString content_type, OAIPipeline body);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIPipelinesApiHandler> handler;

    inline void writeResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
        socket->writeHeaders();
    }
};

}

#endif // OAI_OAIPipelinesApiRequest_H
