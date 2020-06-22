using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineExecutionListRepresentationLinks
    /// </summary>
    public sealed class PipelineExecutionListRepresentationLinks:  IEquatable<PipelineExecutionListRepresentationLinks>
    { 
        /// <summary>
        /// Next
        /// </summary>
        public HalLink Next { get; private set; }

        /// <summary>
        /// Page
        /// </summary>
        public HalLink Page { get; private set; }

        /// <summary>
        /// Prev
        /// </summary>
        public HalLink Prev { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecutionListRepresentationLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecutionListRepresentationLinks()
        {
        }

        private PipelineExecutionListRepresentationLinks(HalLink Next, HalLink Page, HalLink Prev, HalLink Self)
        {
            
            this.Next = Next;
            
            this.Page = Page;
            
            this.Prev = Prev;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecutionListRepresentationLinks.
        /// </summary>
        /// <returns>PipelineExecutionListRepresentationLinksBuilder</returns>
        public static PipelineExecutionListRepresentationLinksBuilder Builder()
        {
            return new PipelineExecutionListRepresentationLinksBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionListRepresentationLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionListRepresentationLinksBuilder</returns>
        public PipelineExecutionListRepresentationLinksBuilder With()
        {
            return Builder()
                .Next(Next)
                .Page(Page)
                .Prev(Prev)
                .Self(Self);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineExecutionListRepresentationLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecutionListRepresentationLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionListRepresentationLinks</param>
        /// <param name="right">Compared (PipelineExecutionListRepresentationLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecutionListRepresentationLinks left, PipelineExecutionListRepresentationLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecutionListRepresentationLinks.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionListRepresentationLinks</param>
        /// <param name="right">Compared (PipelineExecutionListRepresentationLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecutionListRepresentationLinks left, PipelineExecutionListRepresentationLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecutionListRepresentationLinks.
        /// </summary>
        public sealed class PipelineExecutionListRepresentationLinksBuilder
        {
            private HalLink _Next;
            private HalLink _Page;
            private HalLink _Prev;
            private HalLink _Self;

            internal PipelineExecutionListRepresentationLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentationLinks.Next property.
            /// </summary>
            /// <param name="value">Next</param>
            public PipelineExecutionListRepresentationLinksBuilder Next(HalLink value)
            {
                _Next = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentationLinks.Page property.
            /// </summary>
            /// <param name="value">Page</param>
            public PipelineExecutionListRepresentationLinksBuilder Page(HalLink value)
            {
                _Page = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentationLinks.Prev property.
            /// </summary>
            /// <param name="value">Prev</param>
            public PipelineExecutionListRepresentationLinksBuilder Prev(HalLink value)
            {
                _Prev = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionListRepresentationLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public PipelineExecutionListRepresentationLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecutionListRepresentationLinks.
            /// </summary>
            /// <returns>PipelineExecutionListRepresentationLinks</returns>
            public PipelineExecutionListRepresentationLinks Build()
            {
                Validate();
                return new PipelineExecutionListRepresentationLinks(
                    Next: _Next,
                    Page: _Page,
                    Prev: _Prev,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}