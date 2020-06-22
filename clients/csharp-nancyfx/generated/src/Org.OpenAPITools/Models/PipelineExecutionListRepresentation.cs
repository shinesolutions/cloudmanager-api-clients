using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// List of pipeline executions
    /// </summary>
    public sealed class PipelineExecutionListRepresentation:  IEquatable<PipelineExecutionListRepresentation>
    { 
        /// <summary>
        /// TotalNumberOfItems
        /// </summary>
        public int? TotalNumberOfItems { get; private set; }

        /// <summary>
        /// Page
        /// </summary>
        public RequestedPageDetails Page { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public PipelineExecutionListRepresentationEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public PipelineExecutionListRepresentationLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecutionListRepresentation.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecutionListRepresentation()
        {
        }

        private PipelineExecutionListRepresentation(int? TotalNumberOfItems, RequestedPageDetails Page, PipelineExecutionListRepresentationEmbedded Embedded, PipelineExecutionListRepresentationLinks Links)
        {
            
            this.TotalNumberOfItems = TotalNumberOfItems;
            
            this.Page = Page;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecutionListRepresentation.
        /// </summary>
        /// <returns>PipelineExecutionListRepresentationBuilder</returns>
        public static PipelineExecutionListRepresentationBuilder Builder()
        {
            return new PipelineExecutionListRepresentationBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionListRepresentationBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionListRepresentationBuilder</returns>
        public PipelineExecutionListRepresentationBuilder With()
        {
            return Builder()
                .TotalNumberOfItems(TotalNumberOfItems)
                .Page(Page)
                .Embedded(Embedded)
                .Links(Links);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineExecutionListRepresentation other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecutionListRepresentation.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionListRepresentation</param>
        /// <param name="right">Compared (PipelineExecutionListRepresentation</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecutionListRepresentation left, PipelineExecutionListRepresentation right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecutionListRepresentation.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionListRepresentation</param>
        /// <param name="right">Compared (PipelineExecutionListRepresentation</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecutionListRepresentation left, PipelineExecutionListRepresentation right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecutionListRepresentation.
        /// </summary>
        public sealed class PipelineExecutionListRepresentationBuilder
        {
            private int? _TotalNumberOfItems;
            private RequestedPageDetails _Page;
            private PipelineExecutionListRepresentationEmbedded _Embedded;
            private PipelineExecutionListRepresentationLinks _Links;

            internal PipelineExecutionListRepresentationBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentation.TotalNumberOfItems property.
            /// </summary>
            /// <param name="value">TotalNumberOfItems</param>
            public PipelineExecutionListRepresentationBuilder TotalNumberOfItems(int? value)
            {
                _TotalNumberOfItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentation.Page property.
            /// </summary>
            /// <param name="value">Page</param>
            public PipelineExecutionListRepresentationBuilder Page(RequestedPageDetails value)
            {
                _Page = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentation.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public PipelineExecutionListRepresentationBuilder Embedded(PipelineExecutionListRepresentationEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentation.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public PipelineExecutionListRepresentationBuilder Links(PipelineExecutionListRepresentationLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecutionListRepresentation.
            /// </summary>
            /// <returns>PipelineExecutionListRepresentation</returns>
            public PipelineExecutionListRepresentation Build()
            {
                Validate();
                return new PipelineExecutionListRepresentation(
                    TotalNumberOfItems: _TotalNumberOfItems,
                    Page: _Page,
                    Embedded: _Embedded,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}