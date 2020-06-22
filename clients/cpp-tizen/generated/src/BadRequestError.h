/*
 * BadRequestError.h
 *
 * A Bad Request response error.
 */

#ifndef _BadRequestError_H_
#define _BadRequestError_H_


#include <string>
#include "InvalidParameter.h"
#include "MissingParameter.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A Bad Request response error.
 *
 *  \ingroup Models
 *
 */

class BadRequestError : public Object {
public:
	/*! \brief Constructor.
	 */
	BadRequestError();
	BadRequestError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BadRequestError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get HTTP status code of the response.
	 */
	int getStatus();

	/*! \brief Set HTTP status code of the response.
	 */
	void setStatus(int  status);
	/*! \brief Get Error type identifier.
	 */
	std::string getType();

	/*! \brief Set Error type identifier.
	 */
	void setType(std::string  type);
	/*! \brief Get A short summary of the error.
	 */
	std::string getTitle();

	/*! \brief Set A short summary of the error.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Request's missing parameters.
	 */
	std::list<MissingParameter> getMissingParams();

	/*! \brief Set Request's missing parameters.
	 */
	void setMissingParams(std::list <MissingParameter> missingParams);
	/*! \brief Get Request's invalid parameters.
	 */
	std::list<InvalidParameter> getInvalidParams();

	/*! \brief Set Request's invalid parameters.
	 */
	void setInvalidParams(std::list <InvalidParameter> invalidParams);

private:
	int status;
	std::string type;
	std::string title;
	std::list <MissingParameter>missingParams;
	std::list <InvalidParameter>invalidParams;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BadRequestError_H_ */
