using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Describes a __Metric__
    /// </summary>
    public sealed class Metric:  IEquatable<Metric>
    { 
        /// <summary>
        /// KPI result identifier
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Severity of the metric
        /// </summary>
        public SeverityEnum? Severity { get; private set; }

        /// <summary>
        /// Whether metric is considered passed
        /// </summary>
        public bool? Passed { get; private set; }

        /// <summary>
        /// Whether user override the failed metric
        /// </summary>
        public bool? Override { get; private set; }

        /// <summary>
        /// Expected value for the metric
        /// </summary>
        public string ActualValue { get; private set; }

        /// <summary>
        /// Expected value for the metric
        /// </summary>
        public string ExpectedValue { get; private set; }

        /// <summary>
        /// Comparator used for the metric
        /// </summary>
        public ComparatorEnum? Comparator { get; private set; }

        /// <summary>
        /// KPI identifier
        /// </summary>
        public string Kpi { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Metric.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Metric()
        {
        }

        private Metric(string Id, SeverityEnum? Severity, bool? Passed, bool? Override, string ActualValue, string ExpectedValue, ComparatorEnum? Comparator, string Kpi)
        {
            
            this.Id = Id;
            
            this.Severity = Severity;
            
            this.Passed = Passed;
            
            this.Override = Override;
            
            this.ActualValue = ActualValue;
            
            this.ExpectedValue = ExpectedValue;
            
            this.Comparator = Comparator;
            
            this.Kpi = Kpi;
            
        }

        /// <summary>
        /// Returns builder of Metric.
        /// </summary>
        /// <returns>MetricBuilder</returns>
        public static MetricBuilder Builder()
        {
            return new MetricBuilder();
        }

        /// <summary>
        /// Returns MetricBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MetricBuilder</returns>
        public MetricBuilder With()
        {
            return Builder()
                .Id(Id)
                .Severity(Severity)
                .Passed(Passed)
                .Override(Override)
                .ActualValue(ActualValue)
                .ExpectedValue(ExpectedValue)
                .Comparator(Comparator)
                .Kpi(Kpi);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Metric other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Metric.
        /// </summary>
        /// <param name="left">Compared (Metric</param>
        /// <param name="right">Compared (Metric</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Metric left, Metric right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Metric.
        /// </summary>
        /// <param name="left">Compared (Metric</param>
        /// <param name="right">Compared (Metric</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Metric left, Metric right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Metric.
        /// </summary>
        public sealed class MetricBuilder
        {
            private string _Id;
            private SeverityEnum? _Severity;
            private bool? _Passed;
            private bool? _Override;
            private string _ActualValue;
            private string _ExpectedValue;
            private ComparatorEnum? _Comparator;
            private string _Kpi;

            internal MetricBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _Passed = false;
                _Override = false;
            }

            /// <summary>
            /// Sets value for Metric.Id property.
            /// </summary>
            /// <param name="value">KPI result identifier</param>
            public MetricBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Metric.Severity property.
            /// </summary>
            /// <param name="value">Severity of the metric</param>
            public MetricBuilder Severity(SeverityEnum? value)
            {
                _Severity = value;
                return this;
            }

            /// <summary>
            /// Sets value for Metric.Passed property.
            /// </summary>
            /// <param name="value">Whether metric is considered passed</param>
            public MetricBuilder Passed(bool? value)
            {
                _Passed = value;
                return this;
            }

            /// <summary>
            /// Sets value for Metric.Override property.
            /// </summary>
            /// <param name="value">Whether user override the failed metric</param>
            public MetricBuilder Override(bool? value)
            {
                _Override = value;
                return this;
            }

            /// <summary>
            /// Sets value for Metric.ActualValue property.
            /// </summary>
            /// <param name="value">Expected value for the metric</param>
            public MetricBuilder ActualValue(string value)
            {
                _ActualValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for Metric.ExpectedValue property.
            /// </summary>
            /// <param name="value">Expected value for the metric</param>
            public MetricBuilder ExpectedValue(string value)
            {
                _ExpectedValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for Metric.Comparator property.
            /// </summary>
            /// <param name="value">Comparator used for the metric</param>
            public MetricBuilder Comparator(ComparatorEnum? value)
            {
                _Comparator = value;
                return this;
            }

            /// <summary>
            /// Sets value for Metric.Kpi property.
            /// </summary>
            /// <param name="value">KPI identifier</param>
            public MetricBuilder Kpi(string value)
            {
                _Kpi = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Metric.
            /// </summary>
            /// <returns>Metric</returns>
            public Metric Build()
            {
                Validate();
                return new Metric(
                    Id: _Id,
                    Severity: _Severity,
                    Passed: _Passed,
                    Override: _Override,
                    ActualValue: _ActualValue,
                    ExpectedValue: _ExpectedValue,
                    Comparator: _Comparator,
                    Kpi: _Kpi
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum SeverityEnum { Critical, Important, Informational };
        public enum ComparatorEnum { GT, GTE, LT, LTE, EQ, NEQ };
    }
}