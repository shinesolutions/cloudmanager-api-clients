using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// BranchListEmbedded
    /// </summary>
    public sealed class BranchListEmbedded:  IEquatable<BranchListEmbedded>
    { 
        /// <summary>
        /// Branches
        /// </summary>
        public List<RepositoryBranch> Branches { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BranchListEmbedded.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BranchListEmbedded()
        {
        }

        private BranchListEmbedded(List<RepositoryBranch> Branches)
        {
            
            this.Branches = Branches;
            
        }

        /// <summary>
        /// Returns builder of BranchListEmbedded.
        /// </summary>
        /// <returns>BranchListEmbeddedBuilder</returns>
        public static BranchListEmbeddedBuilder Builder()
        {
            return new BranchListEmbeddedBuilder();
        }

        /// <summary>
        /// Returns BranchListEmbeddedBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BranchListEmbeddedBuilder</returns>
        public BranchListEmbeddedBuilder With()
        {
            return Builder()
                .Branches(Branches);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BranchListEmbedded other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BranchListEmbedded.
        /// </summary>
        /// <param name="left">Compared (BranchListEmbedded</param>
        /// <param name="right">Compared (BranchListEmbedded</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BranchListEmbedded left, BranchListEmbedded right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BranchListEmbedded.
        /// </summary>
        /// <param name="left">Compared (BranchListEmbedded</param>
        /// <param name="right">Compared (BranchListEmbedded</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BranchListEmbedded left, BranchListEmbedded right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BranchListEmbedded.
        /// </summary>
        public sealed class BranchListEmbeddedBuilder
        {
            private List<RepositoryBranch> _Branches;

            internal BranchListEmbeddedBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BranchListEmbedded.Branches property.
            /// </summary>
            /// <param name="value">Branches</param>
            public BranchListEmbeddedBuilder Branches(List<RepositoryBranch> value)
            {
                _Branches = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BranchListEmbedded.
            /// </summary>
            /// <returns>BranchListEmbedded</returns>
            public BranchListEmbedded Build()
            {
                Validate();
                return new BranchListEmbedded(
                    Branches: _Branches
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}