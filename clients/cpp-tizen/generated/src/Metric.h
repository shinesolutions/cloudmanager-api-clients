/*
 * Metric.h
 *
 * Describes a __Metric__
 */

#ifndef _Metric_H_
#define _Metric_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes a __Metric__
 *
 *  \ingroup Models
 *
 */

class Metric : public Object {
public:
	/*! \brief Constructor.
	 */
	Metric();
	Metric(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Metric();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get KPI result identifier
	 */
	std::string getId();

	/*! \brief Set KPI result identifier
	 */
	void setId(std::string  id);
	/*! \brief Get Severity of the metric
	 */
	std::string getSeverity();

	/*! \brief Set Severity of the metric
	 */
	void setSeverity(std::string  severity);
	/*! \brief Get Whether metric is considered passed
	 */
	bool getPassed();

	/*! \brief Set Whether metric is considered passed
	 */
	void setPassed(bool  passed);
	/*! \brief Get Whether user override the failed metric
	 */
	bool getOverride();

	/*! \brief Set Whether user override the failed metric
	 */
	void setOverride(bool  override);
	/*! \brief Get Expected value for the metric
	 */
	std::string getActualValue();

	/*! \brief Set Expected value for the metric
	 */
	void setActualValue(std::string  actualValue);
	/*! \brief Get Expected value for the metric
	 */
	std::string getExpectedValue();

	/*! \brief Set Expected value for the metric
	 */
	void setExpectedValue(std::string  expectedValue);
	/*! \brief Get Comparator used for the metric
	 */
	std::string getComparator();

	/*! \brief Set Comparator used for the metric
	 */
	void setComparator(std::string  comparator);
	/*! \brief Get KPI identifier
	 */
	std::string getKpi();

	/*! \brief Set KPI identifier
	 */
	void setKpi(std::string  kpi);

private:
	std::string id;
	std::string severity;
	bool passed;
	bool override;
	std::string actualValue;
	std::string expectedValue;
	std::string comparator;
	std::string kpi;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Metric_H_ */
