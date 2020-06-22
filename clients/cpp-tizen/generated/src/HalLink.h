/*
 * HalLink.h
 *
 * 
 */

#ifndef _HalLink_H_
#define _HalLink_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class HalLink : public Object {
public:
	/*! \brief Constructor.
	 */
	HalLink();
	HalLink(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HalLink();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getHref();

	/*! \brief Set 
	 */
	void setHref(std::string  href);
	/*! \brief Get 
	 */
	bool getTemplated();

	/*! \brief Set 
	 */
	void setTemplated(bool  templated);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	std::string getDeprecation();

	/*! \brief Set 
	 */
	void setDeprecation(std::string  deprecation);
	/*! \brief Get 
	 */
	std::string getProfile();

	/*! \brief Set 
	 */
	void setProfile(std::string  profile);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getHreflang();

	/*! \brief Set 
	 */
	void setHreflang(std::string  hreflang);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string href;
	bool templated;
	std::string type;
	std::string deprecation;
	std::string profile;
	std::string title;
	std::string hreflang;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HalLink_H_ */
