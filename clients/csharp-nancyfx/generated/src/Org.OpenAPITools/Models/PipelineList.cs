using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// PipelineList
    /// </summary>
    public sealed class PipelineList:  IEquatable<PipelineList>
    { 
        /// <summary>
        /// TotalNumberOfItems
        /// </summary>
        public int? TotalNumberOfItems { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public PipelineListEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public ProgramListLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineList.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineList()
        {
        }

        private PipelineList(int? TotalNumberOfItems, PipelineListEmbedded Embedded, ProgramListLinks Links)
        {
            
            this.TotalNumberOfItems = TotalNumberOfItems;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of PipelineList.
        /// </summary>
        /// <returns>PipelineListBuilder</returns>
        public static PipelineListBuilder Builder()
        {
            return new PipelineListBuilder();
        }

        /// <summary>
        /// Returns PipelineListBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineListBuilder</returns>
        public PipelineListBuilder With()
        {
            return Builder()
                .TotalNumberOfItems(TotalNumberOfItems)
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

        public bool Equals(PipelineList other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineList.
        /// </summary>
        /// <param name="left">Compared (PipelineList</param>
        /// <param name="right">Compared (PipelineList</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineList left, PipelineList right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineList.
        /// </summary>
        /// <param name="left">Compared (PipelineList</param>
        /// <param name="right">Compared (PipelineList</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineList left, PipelineList right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineList.
        /// </summary>
        public sealed class PipelineListBuilder
        {
            private int? _TotalNumberOfItems;
            private PipelineListEmbedded _Embedded;
            private ProgramListLinks _Links;

            internal PipelineListBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineList.TotalNumberOfItems property.
            /// </summary>
            /// <param name="value">TotalNumberOfItems</param>
            public PipelineListBuilder TotalNumberOfItems(int? value)
            {
                _TotalNumberOfItems = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineList.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public PipelineListBuilder Embedded(PipelineListEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineList.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public PipelineListBuilder Links(ProgramListLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineList.
            /// </summary>
            /// <returns>PipelineList</returns>
            public PipelineList Build()
            {
                Validate();
                return new PipelineList(
                    TotalNumberOfItems: _TotalNumberOfItems,
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